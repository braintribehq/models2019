/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageDefinitionIdentifier of the Data Model iso20022.
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
{@link businessArea}, 
{@link messageFunctionality}, 
{@link flavour}, 
{@link version}, 

* It provides of then following operations (getters and setters)
{@link getBusinessArea},
{@link getMessageFunctionality},
{@link getFlavour},
{@link getVersion},
{@link setBusinessArea},
{@link setMessageFunctionality},
{@link setFlavour},
{@link setVersion},
 */

@Description("Unique identification of a MessageDefinition within the ISO 20022 namespace, identifying the BusinessArea to which the MessageDefinition belongs, the Message Functionality it covers, its flavour and its version")

public interface MessageDefinitionIdentifier extends GenericEntity, iso20022.ModelEntity {

	EntityType<MessageDefinitionIdentifier> T = EntityTypes.T(MessageDefinitionIdentifier.class);

	/* Constants for each property name. */
	java.lang.String businessArea = "businessArea";
	java.lang.String messageFunctionality = "messageFunctionality";
	java.lang.String flavour = "flavour";
	java.lang.String version = "version";

	@Description("part of a MessageDefinitionIdentifier describing the BusinessArea to which the MessageDefinition using this MessageDefinitionIdentifier belongs")
	@Mandatory
	java.lang.String getBusinessArea();
	void setBusinessArea(java.lang.String businessArea);
	@Description("function and purpose for which a MessageInstance described by a MessageDefinition can be used")
	@Mandatory
	java.lang.String getMessageFunctionality();
	void setMessageFunctionality(java.lang.String messageFunctionality);
	@Description("a variation of a messageFunctionality, whereby MessageDefinitions that are based on this MessageDefinition are compliant to the MessageDefinition from which this MessageDefinition is derived.")
	@Mandatory
	java.lang.String getFlavour();
	void setFlavour(java.lang.String flavour);
	@Description("identifies the version of the MessageDefinition")
	@Mandatory
	java.lang.String getVersion();
	void setVersion(java.lang.String version);
}
