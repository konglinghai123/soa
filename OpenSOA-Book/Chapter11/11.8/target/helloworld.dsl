[when]There is at least one person=person: Person ();
[when]The person is {operator} than {age}=Person ( age {operator} {age});
[when]The person is male=Person ( gender == 'M' );
[when]The person is female=Person ( gender == 'F' );
[when]There is a person who is {operator} than {age}=person: Person ( age {operator} {age});
[when]There is a  person=person:Person()
[when]- age is greater or equal to {age}=age >= {age}
[when]- age is less than or equal to {age}=age <= {age}
[when]- gender is male=gender=='M'
[when]- gender is female=gender=='F' 
[then]Log : "{message}"=System.out.println("{message}");
[then]Print the name of the person=System.out.println("Person is: " + person.getName());
