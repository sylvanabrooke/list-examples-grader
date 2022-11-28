# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

cd student-submission
if test -f ListExamples.java
then 
    echo "ListExamples.jav exists"
else 
    echo "ListExamples.java does not existtttttttt Score: 0/4"
    exit 1
fi

cp ListExamples.java ../

set +e 

cd ..
javac -cp ".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar" TestListExamples.java ListExamples.java
if test $? -eq 0;
then
    echo "compile sucess!!!"
else 
    echo "compile unsuccessful! Score: 0/4"
    exit 1
fi


java -cp ".:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestListExamples > score.txt



score= grep -F "Failures: " score.txt
numFail= echo Score: $((4 - ${score:-1}))/4

#$score= $(grep -n 'Failures:' score.txt)
#echo ${score:-1}
#echo "$score"
