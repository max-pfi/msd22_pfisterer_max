# Exercise 6
## Generating Maven Site Documentation
To generate a maven site documentation it is necessary to include some plugins into the project and update
 some additional information about the project.

### Maven site documentation
* `<groupId>org.apache.maven.plugins</groupId>`
* `<artifactId>maven-project-info-reports-plugin</artifactId>`

### Java Doc within Maven Site Documentation
* `<groupId>org.apache.maven.plugins</groupId>`
* `<artifactId>maven-javadoc-plugin</artifactId>`
### Test Coverage with JaCoCo Plugin
* `<groupId>org.jacoco</groupId>`
* `<artifactId>jacoco-maven-plugin</artifactId>`

### Additional Information
* in the `<developers>` tag all developers are added
* the `<url>` tag specifies the link to the project on the documentation site

## Folder Structure
To add Markdown files to the site it is necessary to create a site-folder in the src directory and a markdown subfolder.

## Configurations
In the site.xml one can configure the created site. Some main points are the project name,
and the menus, where one can link to different html pages.