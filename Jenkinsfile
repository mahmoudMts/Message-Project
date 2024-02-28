node {
  checkout scm
}
pipeline {
  agent any
  options {
    ansiColor('xterm')
    buildDiscarder(logRotator(numToKeepStr: '15'))
    timestamps()
    timeout(time: 60, unit: 'MINUTES')
  }

  parameters {
    string(name: 'awsAccountNumberForECR',  defaultValue: '763157542448',  description: 'The AWS Account Number where ECR is located', trim: true)
    string(name: 'awsRegion',  defaultValue: 'eu-west-2',  description: 'The AWS Region where this job is ran against, i.e eu-west-2', trim: true)
    string(name: 'boundedContextShortName',  defaultValue: 'em',  description: 'The AWS Region where this job is ran against, i.e eu-west-2', trim: true)
    string(name: 'microserviceShortName',  defaultValue: 'edim',  description: 'The AWS Region where this job is ran against, i.e eu-west-2', trim: true)
    string(name: 'ecrOrgName', defaultValue: 'lm', description: 'The Organisation Name within ECR. Usually lm.', trim: true)
    string(name: 'env', defaultValue: 'dev101', description: 'The environment where CD will deploy to automatically.', trim: true)
  }

  stages {
        stage('Trigger CI'){
          steps {
              script {
                withCredentials ([usernamePassword(credentialsId: 'lm-jenkins-bot', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PASSWORD')]){
                  build job:'Pipeline/CI.Java' , parameters:[
                    string(name: "awsRegion",  value: "${params.awsRegion}"),
                    string(name: "awsAccountNumberForECR", value: "${params.awsAccountNumberForECR}"),
                    string(name: "boundedContextShortName", value: "${params.boundedContextShortName}"),
                    string(name: "buildNumber",  value: "${env.BUILD_NUMBER}"),
                    string(name: "env",  value: "${params.env}"),
                    string(name: "ecrOrgName", value: "${params.ecrOrgName}"),
                    string(name: "gitBranchName", value: "${env.GIT_BRANCH.replaceAll("origin/","")}"),
                    string(name: "gitCommitHash", value: "${env.GIT_COMMIT}"),
                    string(name: "gitUrl", value: "${env.GIT_URL}"),
                    string(name: "jenkinsJobBaseName", value: "${env.JOB_BASE_NAME}"),
                    string(name: "microserviceShortName", value: "${params.microserviceShortName}")
                  ]
                } // end with credentials
              } // end script
          } // end steps
        } // end CI Trigger Stage stage
  } // end stages
} // end pipeline
