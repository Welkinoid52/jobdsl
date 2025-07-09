folder('ProjectA/A2')

job('ProjectA/A2/a2_jenkins_job') {
    description('Job for ProjectA → A2')
    steps {
        shell('echo Running a2_jenkins_job...')
    }
}
