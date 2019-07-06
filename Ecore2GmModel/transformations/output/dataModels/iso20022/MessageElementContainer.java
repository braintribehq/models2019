/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageElementContainer of the Data Model iso20022.
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
{@link messageElement}, 

* It provides of then following operations (getters and setters)
{@link getMessageElement},
{@link setMessageElement},
 */

@Description("Re-usable Dictionary Item that is a building block for assembling MessageDefinitions, composed of a sequence of MessageElements")
 
@Abstract 

public interface MessageElementContainer extends GenericEntity, iso20022.MessageComponentType {

	EntityType<MessageElementContainer> T = EntityTypes.T(MessageElementContainer.class);

	/* Constants for each property name. */
	java.lang.String messageElement = "messageElement";

	@Description("a semantic property of a MessageComponentType")
	
	java.util.List<iso20022.MessageElement> getMessageElement();
	void setMessageElement(java.util.List<iso20022.MessageElement> messageElement);

}
