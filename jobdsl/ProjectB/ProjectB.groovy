folder('ProjectB')

job('ProjectB/b_jenkins_job') {
    description('Job for ProjectB')
    steps {
        shell('echo Hello from b_jenkins_job')
    }
}
