/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertySetTemplate of the Data Model iai.
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
{@link TemplateType}, 
{@link ApplicableEntity}, 
{@link HasPropertyTemplates}, 
{@link Defines}, 

* It provides of then following operations (getters and setters)
{@link getTemplateType},
{@link getApplicableEntity},
{@link getHasPropertyTemplates},
{@link getDefines},
{@link setTemplateType},
{@link setApplicableEntity},
{@link setHasPropertyTemplates},
{@link setDefines},
 */

@Description("")

public interface IfcPropertySetTemplate extends GenericEntity, ifc4.IfcPropertyTemplateDefinition {

	EntityType<IfcPropertySetTemplate> T = EntityTypes.T(IfcPropertySetTemplate.class);

	/* Constants for each property name. */
	java.lang.String TemplateType = "TemplateType";
	java.lang.String ApplicableEntity = "ApplicableEntity";
	java.lang.String HasPropertyTemplates = "HasPropertyTemplates";
	java.lang.String Defines = "Defines";

	@Description("")
	@Mandatory
	ifc4.IfcPropertySetTemplateTypeEnum getTemplateType();
	void setTemplateType(ifc4.IfcPropertySetTemplateTypeEnum TemplateType);
	@Description("")
	@Mandatory
	java.lang.String getApplicableEntity();
	void setApplicableEntity(java.lang.String ApplicableEntity);
	@Description("")
	
	java.util.List<ifc4.IfcPropertyTemplate> getHasPropertyTemplates();
	void setHasPropertyTemplates(java.util.List<ifc4.IfcPropertyTemplate> HasPropertyTemplates);

	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByTemplate> getDefines();
	void setDefines(java.util.List<ifc4.IfcRelDefinesByTemplate> Defines);

}
