/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessArea of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link code}, 
{@link messageDefinition}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getMessageDefinition},
{@link setCode},
{@link setMessageDefinition},
 */

@Description("Set of strongly related business activities, that provide a self-standing business value to a set of BusinessRoles.")

public interface BusinessArea extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<BusinessArea> T = EntityTypes.T(BusinessArea.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String messageDefinition = "messageDefinition";

	@Description("The value of the BusinessArea code.")
	@Mandatory
	java.lang.String getCode();
	void setCode(java.lang.String code);
	@Description("The MessageDefinition that belongs to the BusinessArea.")
	
	java.util.List<iso20022.MessageDefinition> getMessageDefinition();
	void setMessageDefinition(java.util.List<iso20022.MessageDefinition> messageDefinition);

}
