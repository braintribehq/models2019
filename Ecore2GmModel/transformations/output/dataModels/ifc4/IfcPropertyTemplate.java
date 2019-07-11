/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyTemplate of the Data Model iai.
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
{@link PartOfComplexTemplate}, 
{@link PartOfPsetTemplate}, 

* It provides of then following operations (getters and setters)
{@link getPartOfComplexTemplate},
{@link getPartOfPsetTemplate},
{@link setPartOfComplexTemplate},
{@link setPartOfPsetTemplate},
 */

@Description("")

public interface IfcPropertyTemplate extends GenericEntity, ifc4.IfcPropertyTemplateDefinition {

	EntityType<IfcPropertyTemplate> T = EntityTypes.T(IfcPropertyTemplate.class);

	/* Constants for each property name. */
	java.lang.String PartOfComplexTemplate = "PartOfComplexTemplate";
	java.lang.String PartOfPsetTemplate = "PartOfPsetTemplate";

	@Description("")
	
	java.util.List<ifc4.IfcComplexPropertyTemplate> getPartOfComplexTemplate();
	void setPartOfComplexTemplate(java.util.List<ifc4.IfcComplexPropertyTemplate> PartOfComplexTemplate);

	@Description("")
	
	java.util.List<ifc4.IfcPropertySetTemplate> getPartOfPsetTemplate();
	void setPartOfPsetTemplate(java.util.List<ifc4.IfcPropertySetTemplate> PartOfPsetTemplate);

}
