pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }
                post{
                        always{
                                    junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults : true)
                                }
                            }
}
