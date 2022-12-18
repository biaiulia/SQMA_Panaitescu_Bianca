pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post{
                always{
                    junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults : true)
                }
            }
        }
    }
}