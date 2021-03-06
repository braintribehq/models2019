/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConversionBasedUnit of the Data Model iai.
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
{@link ConversionFactor}, 
{@link HasExternalReference}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getConversionFactor},
{@link getHasExternalReference},
{@link setName},
{@link setConversionFactor},
{@link setHasExternalReference},
 */

@Description("")

public interface IfcConversionBasedUnit extends GenericEntity, ifc4.IfcNamedUnit, ifc4.IfcResourceObjectSelect {

	EntityType<IfcConversionBasedUnit> T = EntityTypes.T(IfcConversionBasedUnit.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String ConversionFactor = "ConversionFactor";
	java.lang.String HasExternalReference = "HasExternalReference";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	ifc4.IfcMeasureWithUnit getConversionFactor();
	void setConversionFactor(ifc4.IfcMeasureWithUnit ConversionFactor);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReference();
	void setHasExternalReference(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReference);

}
