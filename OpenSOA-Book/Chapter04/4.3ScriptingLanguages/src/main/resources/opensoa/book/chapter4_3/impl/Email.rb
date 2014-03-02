require 'net/smtp'

def email(from, to, subject, body, caseNo)
    puts "Inside Ruby Email.rb Component"
puts "From is: " + from
puts "To is: " + to
puts "subject is: " + subject
puts "body is: " + body
puts "host is: " + $smtp_host

myMessage = <<END_OF_MESSAGE
From: #{from}
To: #{to}
Subject: Case: #{caseNo} - #{subject}

#{body}
END_OF_MESSAGE

   Net::SMTP.start($smtp_host, 25, $smtp_domain, $smtp_username,$smtp_password, :login) do |smtp|
     smtp.send_message myMessage, from, to
   end
    return "true"
end
