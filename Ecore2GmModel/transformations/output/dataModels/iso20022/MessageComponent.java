/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageComponent of the Data Model iso20022.
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
{@link xors}, 

* It provides of then following operations (getters and setters)
{@link getXors},
{@link setXors},
 */

@Description("re-usable Dictionary Item that is a building block for assembling MessageDefinitions, composed of a sequence of MessageElements")

public interface MessageComponent extends GenericEntity, iso20022.MessageElementContainer {

	EntityType<MessageComponent> T = EntityTypes.T(MessageComponent.class);

	/* Constants for each property name. */
	java.lang.String xors = "xors";

	@Description("XORs applied to a selection of the elements of the Message Component.")
	
	java.util.List<iso20022.Xor> getXors();
	void setXors(java.util.List<iso20022.Xor> xors);

}
