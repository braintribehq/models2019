/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLibraryInformation of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Name}, 
{@link Version}, 
{@link Publisher}, 
{@link VersionDate}, 
{@link Location}, 
{@link Description}, 
{@link LibraryInfoForObjects}, 
{@link HasLibraryReferences}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getVersion},
{@link getPublisher},
{@link getVersionDate},
{@link getLocation},
{@link getDescription},
{@link getLibraryInfoForObjects},
{@link getHasLibraryReferences},
{@link setName},
{@link setVersion},
{@link setPublisher},
{@link setVersionDate},
{@link setLocation},
{@link setDescription},
{@link setLibraryInfoForObjects},
{@link setHasLibraryReferences},
 */

@Description("")

public interface IfcLibraryInformation extends GenericEntity, ifc4.IfcExternalInformation, ifc4.IfcLibrarySelect {

	EntityType<IfcLibraryInformation> T = EntityTypes.T(IfcLibraryInformation.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Version = "Version";
	java.lang.String Publisher = "Publisher";
	java.lang.String VersionDate = "VersionDate";
	java.lang.String Location = "Location";
	java.lang.String Description = "Description";
	java.lang.String LibraryInfoForObjects = "LibraryInfoForObjects";
	java.lang.String HasLibraryReferences = "HasLibraryReferences";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getVersion();
	void setVersion(java.lang.String Version);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getPublisher();
	void setPublisher(ifc4.IfcActorSelect Publisher);
	@Description("")
	@Mandatory
	java.lang.String getVersionDate();
	void setVersionDate(java.lang.String VersionDate);
	@Description("")
	@Mandatory
	java.lang.String getLocation();
	void setLocation(java.lang.String Location);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesLibrary> getLibraryInfoForObjects();
	void setLibraryInfoForObjects(java.util.List<ifc4.IfcRelAssociatesLibrary> LibraryInfoForObjects);

	@Description("")
	
	java.util.List<ifc4.IfcLibraryReference> getHasLibraryReferences();
	void setHasLibraryReferences(java.util.List<ifc4.IfcLibraryReference> HasLibraryReferences);

}
