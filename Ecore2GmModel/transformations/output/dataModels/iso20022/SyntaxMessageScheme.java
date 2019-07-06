/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SyntaxMessageScheme of the Data Model iso20022.
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
{@link messageDefinitionTrace}, 

* It provides of then following operations (getters and setters)
{@link getMessageDefinitionTrace},
{@link setMessageDefinitionTrace},
 */

@Description("syntax processable notation used to define the structure of a MessageInstance in a particular syntax")

public interface SyntaxMessageScheme extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<SyntaxMessageScheme> T = EntityTypes.T(SyntaxMessageScheme.class);

	/* Constants for each property name. */
	java.lang.String messageDefinitionTrace = "messageDefinitionTrace";

	@Description("the MessageDefinitionTrace from the SyntaxMessageScheme to the MessageDefinition")
	@Mandatory
	iso20022.MessageDefinition getMessageDefinitionTrace();
	void setMessageDefinitionTrace(iso20022.MessageDefinition messageDefinitionTrace);
}
