/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcComplexPropertyTemplate of the Data Model iai.
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
{@link UsageName}, 
{@link TemplateType}, 
{@link HasPropertyTemplates}, 

* It provides of then following operations (getters and setters)
{@link getUsageName},
{@link getTemplateType},
{@link getHasPropertyTemplates},
{@link setUsageName},
{@link setTemplateType},
{@link setHasPropertyTemplates},
 */

@Description("")

public interface IfcComplexPropertyTemplate extends GenericEntity, ifc4.IfcPropertyTemplate {

	EntityType<IfcComplexPropertyTemplate> T = EntityTypes.T(IfcComplexPropertyTemplate.class);

	/* Constants for each property name. */
	java.lang.String UsageName = "UsageName";
	java.lang.String TemplateType = "TemplateType";
	java.lang.String HasPropertyTemplates = "HasPropertyTemplates";

	@Description("")
	@Mandatory
	java.lang.String getUsageName();
	void setUsageName(java.lang.String UsageName);
	@Description("")
	@Mandatory
	ifc4.IfcComplexPropertyTemplateTypeEnum getTemplateType();
	void setTemplateType(ifc4.IfcComplexPropertyTemplateTypeEnum TemplateType);
	@Description("")
	
	java.util.List<ifc4.IfcPropertyTemplate> getHasPropertyTemplates();
	void setHasPropertyTemplates(java.util.List<ifc4.IfcPropertyTemplate> HasPropertyTemplates);

}
