/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPhysicalQuantity of the Data Model iai.
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
{@link Description}, 
{@link HasExternalReferences}, 
{@link PartOfComplex}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getHasExternalReferences},
{@link getPartOfComplex},
{@link setName},
{@link setDescription},
{@link setHasExternalReferences},
{@link setPartOfComplex},
 */

@Description("")

public interface IfcPhysicalQuantity extends GenericEntity, ifc4.IfcResourceObjectSelect {

	EntityType<IfcPhysicalQuantity> T = EntityTypes.T(IfcPhysicalQuantity.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String HasExternalReferences = "HasExternalReferences";
	java.lang.String PartOfComplex = "PartOfComplex";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReferences();
	void setHasExternalReferences(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReferences);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcPhysicalComplexQuantity> getPartOfComplex();
	void setPartOfComplex(java.util.List<ifc4.IfcPhysicalComplexQuantity> PartOfComplex);

}
