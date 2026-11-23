
pipeline {
    agent any

    stages {

        stage('Hello') {
            steps {
                echo 'Hello World!'
                echo 'Welcome to Jenkins Pipeline'
            }
        }

        stage('Checkout') {
            steps {
                echo 'Fetching source code from GitHub...'
                echo 'Checkout completed!'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                echo 'Build completed successfully!'
            }
        }

        stage('Test') {
            steps {
                echo 'Running application tests...'
                echo 'All tests passed!'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                echo 'Application deployed successfully!'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }

        always {
            echo 'Pipeline execution completed.'
        }
    }
}
