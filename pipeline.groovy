def project = "DevOps-Demo"
def github_repo_url = "https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war"

folder (project){
description('DSL for DevOps-Demo')
}

mavenJob ("${project}/${project}_compile") {
description ("""<h4>JOB1 of DevOps CI/CD pipeline Demo</h4>
Compiles <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
githubPush()
    }
    goals ('clean compile')
postBuildSteps('SUCCESS') {
        buildDescription('','${GIT_COMMIT}')
    }
}

mavenJob ("${project}/${project}_test") {
description ("""<h4>JOB2 of DevOps CI/CD pipeline Demo</h4>
test <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
githubPush()
    }
    goals ('test')
postBuildSteps('SUCCESS') {
        buildDescription('','${GIT_COMMIT}')
    }
}

mavenJob ("${project}/${project}_package") {
description ("""<h4>JOB3 of DevOps CI/CD pipeline Demo</h4>
package <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
        githubPush()
    }
    goals ('package')
postBuildSteps('SUCCESS') {
        buildDescription('','1.0_${BUILD_NUMBER}')
    }
}


##############################################

def project = "DevOps-Demo"
def githun_repo_url = "https://github.com/erarunkumar/spring-boot-sample"
def github_project_repo = "erarunkumar/spring-boot-sample"
branch = "upgrade_jar_to_war"

folder (project){
description('DSL for DevOps-Demo')
}

mavenJob ("${project}/${project}_compile") {
description ("""<h4>JOB1 of DevOps CI/CD pipeline Demo</h4>
Compiles <a href='${githun_repo_url}/tree/${branch}'>${githun_repo_url}/tree/${branch}</a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
githubPush()
    }
    goals ('clean compile')
postBuildSteps('SUCCESS') {
        buildDescription('','${GIT_COMMIT}')
    }
}

mavenJob ("${project}/${project}_test") {
description ("""<h4>JOB2 of DevOps CI/CD pipeline Demo</h4>
test <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
githubPush()
    }
    goals ('test')
postBuildSteps('SUCCESS') {
        buildDescription('','${GIT_COMMIT}')
    }
}

mavenJob ("${project}/${project}_package") {
description ("""<h4>JOB3 of DevOps CI/CD pipeline Demo</h4>
package <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    label('BUILD')
jdk('JDK1.8_172')
    scm {
         git {
              remote {
                      github ('erarunkumar/spring-boot-sample', 'https')
              }
              branches ('upgrade_jar_to_war', 'tree')
              extensions {
                          cleanBeforeCheckout()
              }
        }
    }
    triggers {
        githubPush()
    }
    goals ('package')
postBuildSteps('SUCCESS') {
        buildDescription('','1.0_${BUILD_NUMBER}')
    }
}

________________________________________
From: arun kumar <er.arunkumar@live.com>
Sent: Sunday, May 6, 2018 11:11:12 PM
To: Arun Kumar - NTL
Subject: DSL 
 
root@gitlab:/var/lib/jenkins/workspace/Seed_Job# cat pipeline.groovy
def project = "DevOps-Demo"
def github_repo_url = "https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war"
 
folder (project){
        description('DSL for DevOps-Demo')
}
mavenJob ("${project}/${project}_compile") {
    description ("""<h4>JOB1 of DevOps CI/CD pipeline Demo</h4>
Compiles <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    jdk('JDK1.8_172')
        scm {
         git {
                          remote {
                                        github ('erarunkumar/spring-boot-sample', 'https')
                          }
                          branches ('upgrade_jar_to_war', 'tree')
                          extensions {
                                                cleanBeforeCheckout()
              }
            }
    }
        triggers {
        githubPush()
    }
    goals ('clean compile')
}
 
mavenJob ("${project}/${project}_test") {
    description ("""<h4>JOB2 of DevOps CI/CD pipeline Demo</h4>
test <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    jdk('JDK1.8_172')
        scm {
         git {
                          remote {
                                        github ('erarunkumar/spring-boot-sample', 'https')
                          }
                          branches ('upgrade_jar_to_war', 'tree')
                          extensions {
                                                cleanBeforeCheckout()
              }
            }
    }
        triggers {
        githubPush()
    }
    goals ('test')
}
 
mavenJob ("${project}/${project}_package") {
    description ("""<h4>JOB3 of DevOps CI/CD pipeline Demo</h4>
package <a href='https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war'>https://github.com/erarunkumar/spring-boot-sample/tree/upgrade_jar_to_war </a>""")
    jdk('JDK1.8_172')
        scm {
         git {
                          remote {
                                        github ('erarunkumar/spring-boot-sample', 'https')
                          }
                          branches ('upgrade_jar_to_war', 'tree')
                          extensions {
                                                cleanBeforeCheckout()
              }
            }
    }
        triggers {
        githubPush()
    }
    goals ('package')
}
root@gitlab:/var/lib/jenkins/workspace/Seed_Job#
