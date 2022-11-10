# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

if [[-f ListExamples.java]];
then 
    echo "ListExamples.jav exists"
    exit 0
else 
    echo "ListExamples.java does not existtttttttt"
    exit 1
fi
