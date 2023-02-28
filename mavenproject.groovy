job ('first maven job dsl') {
	description("this is dsl jon on ${new Date()}, this is small project hosted on github")
	scm {
		git("https://github.com/Sadhiq93/prac-pro.git" , 'master')
		}
	triggers {
		scm('* * * * *')
		}
	steps{
		maven('clean , package', 'prac-pro/pom.xml')
		}
	publishers{
		//archive this .war file generated
		archiveArtifacts '**/*.war'
		}
	}
