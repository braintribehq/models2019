/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageSet of the Data Model iso20022.
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
{@link generatedSyntax}, 
{@link validEncoding}, 
{@link messageDefinition}, 

* It provides of then following operations (getters and setters)
{@link getGeneratedSyntax},
{@link getValidEncoding},
{@link getMessageDefinition},
{@link setGeneratedSyntax},
{@link setValidEncoding},
{@link setMessageDefinition},
 */

@Description("A set of MessageDefinitions")

public interface MessageSet extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<MessageSet> T = EntityTypes.T(MessageSet.class);

	/* Constants for each property name. */
	java.lang.String generatedSyntax = "generatedSyntax";
	java.lang.String validEncoding = "validEncoding";
	java.lang.String messageDefinition = "messageDefinition";

	@Description("identification of the syntax for a specific EncodingScheme")
	
	java.util.List<iso20022.Syntax> getGeneratedSyntax();
	void setGeneratedSyntax(java.util.List<iso20022.Syntax> generatedSyntax);

	@Description("the set of encodings considered ISO 20022 valid for this MessageSet")
	
	java.util.List<iso20022.Encoding> getValidEncoding();
	void setValidEncoding(java.util.List<iso20022.Encoding> validEncoding);

	@Description("the MessageDefinition that belongs to the MessageSet")
	
	java.util.List<iso20022.MessageDefinition> getMessageDefinition();
	void setMessageDefinition(java.util.List<iso20022.MessageDefinition> messageDefinition);

}
