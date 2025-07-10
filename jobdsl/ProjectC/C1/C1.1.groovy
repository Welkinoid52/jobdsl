folder('ProjectC')
folder('ProjectC/C1')
folder('ProjectC/C1/C1.1')

job('ProjectC/C1/C1.1/c1_1_jenkins_job') {
    description('Job for ProjectC → C1 → C1.1')
    steps {
        shell('echo Running c1_1_jenkins_job...')
    }
}
