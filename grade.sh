# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

if [[-e ListExamples.java]]
then 
    exit 0
