folder('ProjectC/C2')

job('ProjectC/C2/c2_jenkins_job') {
    description('Job for ProjectC → C2')
    steps {
        shell('echo Running c2_jenkins_job...')
    }
}
