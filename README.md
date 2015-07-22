# ontouml

Requirements:
- Eclipse Modeling Tools (Mars recommended)
- Java 7 or superior
- OCL Tools & Ecore Tools (Eclipse->Help->Install Modeling Components)
- XCore SDK (Eclipse->Help->Install New Software)

Our infrastructure for OntoUML 2.0 is in XCore, a concrete syntax for Ecore (https://wiki.eclipse.org/Xcore). In order to generate the respective GenModel and Ecore file from XCore, do as follows:

  - Right click at "ontouml.xcore" -> New -> Other -> EMF Generator Model  
  - Write a Name for the generated (genmodel) file -> Next
  - XCore -> Load -> Select the "ontouml" root package -> Finish
  
In order to export the OntoUML 2.0 infrastructure as an Eclipse plugin go to:

  - Right click on the project "net.menthor.onto2.ontouml" -> Export -> Deployable plugin and fragments -> Next
  - Mark all the projects and choose an appropriate destination directory -> Finish
  - Put the generated jars at the "/plugins" folder of your eclipse.

