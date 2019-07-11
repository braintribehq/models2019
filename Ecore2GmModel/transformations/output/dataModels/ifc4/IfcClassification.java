/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcClassification of the Data Model iai.
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
{@link Source}, 
{@link Edition}, 
{@link EditionDate}, 
{@link Name}, 
{@link Description}, 
{@link Location}, 
{@link ReferenceTokens}, 
{@link ClassificationForObjects}, 
{@link HasReferences}, 

* It provides of then following operations (getters and setters)
{@link getSource},
{@link getEdition},
{@link getEditionDate},
{@link getName},
{@link getDescription},
{@link getLocation},
{@link getReferenceTokens},
{@link getClassificationForObjects},
{@link getHasReferences},
{@link setSource},
{@link setEdition},
{@link setEditionDate},
{@link setName},
{@link setDescription},
{@link setLocation},
{@link setReferenceTokens},
{@link setClassificationForObjects},
{@link setHasReferences},
 */

@Description("")

public interface IfcClassification extends GenericEntity, ifc4.IfcExternalInformation, ifc4.IfcClassificationReferenceSelect, ifc4.IfcClassificationSelect {

	EntityType<IfcClassification> T = EntityTypes.T(IfcClassification.class);

	/* Constants for each property name. */
	java.lang.String Source = "Source";
	java.lang.String Edition = "Edition";
	java.lang.String EditionDate = "EditionDate";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Location = "Location";
	java.lang.String ReferenceTokens = "ReferenceTokens";
	java.lang.String ClassificationForObjects = "ClassificationForObjects";
	java.lang.String HasReferences = "HasReferences";

	@Description("")
	@Mandatory
	java.lang.String getSource();
	void setSource(java.lang.String Source);
	@Description("")
	@Mandatory
	java.lang.String getEdition();
	void setEdition(java.lang.String Edition);
	@Description("")
	@Mandatory
	java.lang.String getEditionDate();
	void setEditionDate(java.lang.String EditionDate);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getLocation();
	void setLocation(java.lang.String Location);
	@Description("")
	
	java.util.List<java.lang.String> getReferenceTokens();
	void setReferenceTokens(java.util.List<java.lang.String> ReferenceTokens);

	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesClassification> getClassificationForObjects();
	void setClassificationForObjects(java.util.List<ifc4.IfcRelAssociatesClassification> ClassificationForObjects);

	@Description("")
	
	java.util.List<ifc4.IfcClassificationReference> getHasReferences();
	void setHasReferences(java.util.List<ifc4.IfcClassificationReference> HasReferences);

}
