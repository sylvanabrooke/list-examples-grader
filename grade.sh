# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

if [[-e ListExamples.java]]
then 
    exit 0
else 
    echo "ListExamples.java does not existtttttttt"
    exit 1
fi
