/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcClassificationReference of the Data Model iai.
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
{@link ReferencedSource}, 
{@link Description}, 
{@link Sort}, 
{@link ClassificationRefForObjects}, 
{@link HasReferences}, 

* It provides of then following operations (getters and setters)
{@link getReferencedSource},
{@link getDescription},
{@link getSort},
{@link getClassificationRefForObjects},
{@link getHasReferences},
{@link setReferencedSource},
{@link setDescription},
{@link setSort},
{@link setClassificationRefForObjects},
{@link setHasReferences},
 */

@Description("")

public interface IfcClassificationReference extends GenericEntity, ifc4.IfcExternalReference, ifc4.IfcClassificationReferenceSelect, ifc4.IfcClassificationSelect {

	EntityType<IfcClassificationReference> T = EntityTypes.T(IfcClassificationReference.class);

	/* Constants for each property name. */
	java.lang.String ReferencedSource = "ReferencedSource";
	java.lang.String Description = "Description";
	java.lang.String Sort = "Sort";
	java.lang.String ClassificationRefForObjects = "ClassificationRefForObjects";
	java.lang.String HasReferences = "HasReferences";

	@Description("")
	@Mandatory
	ifc4.IfcClassificationReferenceSelect getReferencedSource();
	void setReferencedSource(ifc4.IfcClassificationReferenceSelect ReferencedSource);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getSort();
	void setSort(java.lang.String Sort);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesClassification> getClassificationRefForObjects();
	void setClassificationRefForObjects(java.util.List<ifc4.IfcRelAssociatesClassification> ClassificationRefForObjects);

	@Description("")
	
	java.util.List<ifc4.IfcClassificationReference> getHasReferences();
	void setHasReferences(java.util.List<ifc4.IfcClassificationReference> HasReferences);

}
