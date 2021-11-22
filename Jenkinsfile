pipeline{
     agent any

     stages{
     stage ('compile Stage'){

         steps{
         withMaven(maven:''){
         sh 'mvn clean compile'
         }
     }
        }
        stage('Testing Stage'){

           steps{
              withMaven(maven : ''){
                  sh 'mvn test'
              }
              }
        }
        stage ('Deployment Stage'){
           steps{
              withMaven(maven: ''){
                sh 'mvn deploy'
           }
        }
        }

        }
        }