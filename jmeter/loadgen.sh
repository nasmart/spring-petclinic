HOST=petclinic-holland-pm7mwv4wha-ez.a.run.app
PORT=443
PROTOCOL=https
SYMPTOMS=/Users/manuelhurtado/Documents/Demos/spring-petclinic/jmeter/mh-gold/symptoms.csv
DURATION=$1

echo Launching load during $DURATION seconds

jmeter -Jsymptoms_csv=$SYMPTOMS -Jhostname=$HOST -Jport=$PORT -Jprotocol=$PROTOCOL -Jduration=$DURATION -n -t PetClinic.jmx 
