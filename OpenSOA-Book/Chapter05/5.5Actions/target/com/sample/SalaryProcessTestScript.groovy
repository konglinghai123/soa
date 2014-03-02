package com.sample

import org.jbpm.context.exe.ContextInstance
import static org.jbpm.graph.def.ProcessDefinition.*
import org.jbpm.graph.exe.ProcessInstance
import com.sample.objects.SalaryObject

ContextInstance.metaClass.setProperty = { name, val -> delegate.setVariable(name, val) }
ContextInstance.metaClass.getProperty = { name -> delegate.getVariable(name) }
//ContextInstance.metaClass {
//    setProperty { name, val -> delegate.setVariable(name, val) }
//    getProperty { name -> delegate.getVariable(name) }
//}

def salary = new SalaryObject()
def processDefinition = parseXmlResource("salary/processdefinition.xml")
assert processDefinition
def instance = new ProcessInstance(processDefinition)
def contextInstance = instance.contextInstance
assert instance.rootToken.node.name == "start"
//contextInstance.setVariable("salary", salary)
contextInstance.salary = salary

// start state -> field state
println salary.dump()
instance.signal()
println salary.dump()
assert instance.rootToken.node.name == "approve"
//assert instance.contextInstance.getVariable("salary").proposedSalary == 55000
assert instance.contextInstance.salary.proposedSalary == 55000

// field state -> completion
instance.signal()
println salary.dump()
assert instance.hasEnded()
