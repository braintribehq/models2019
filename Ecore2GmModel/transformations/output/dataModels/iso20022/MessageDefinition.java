/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageDefinition of the Data Model iso20022.
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
{@link messageSet}, 
{@link xmlName}, 
{@link xmlTag}, 
{@link businessArea}, 
{@link xors}, 
{@link rootElement}, 
{@link messageBuildingBlock}, 
{@link choreography}, 
{@link trace}, 
{@link messageDefinitionIdentifier}, 
{@link derivation}, 

* It provides of then following operations (getters and setters)
{@link getMessageSet},
{@link getXmlName},
{@link getXmlTag},
{@link getBusinessArea},
{@link getXors},
{@link getRootElement},
{@link getMessageBuildingBlock},
{@link getChoreography},
{@link getTrace},
{@link getMessageDefinitionIdentifier},
{@link getDerivation},
{@link setMessageSet},
{@link setXmlName},
{@link setXmlTag},
{@link setBusinessArea},
{@link setXors},
{@link setRootElement},
{@link setMessageBuildingBlock},
{@link setChoreography},
{@link setTrace},
{@link setMessageDefinitionIdentifier},
{@link setDerivation},
 */

@Description("Formal description of the structure of a MessageInstance")

public interface MessageDefinition extends GenericEntity, iso20022.RepositoryType {

	EntityType<MessageDefinition> T = EntityTypes.T(MessageDefinition.class);

	/* Constants for each property name. */
	java.lang.String messageSet = "messageSet";
	java.lang.String xmlName = "xmlName";
	java.lang.String xmlTag = "xmlTag";
	java.lang.String businessArea = "businessArea";
	java.lang.String xors = "xors";
	java.lang.String rootElement = "rootElement";
	java.lang.String messageBuildingBlock = "messageBuildingBlock";
	java.lang.String choreography = "choreography";
	java.lang.String trace = "trace";
	java.lang.String messageDefinitionIdentifier = "messageDefinitionIdentifier";
	java.lang.String derivation = "derivation";

	@Description("the MessageSet to which the MessageDefinition belongs")
	
	java.util.List<iso20022.MessageSet> getMessageSet();
	void setMessageSet(java.util.List<iso20022.MessageSet> messageSet);

	@Description("Name used in an XML schema for the ComplexType that defines the Message Definition.")
	@Mandatory
	java.lang.String getXmlName();
	void setXmlName(java.lang.String xmlName);
	@Description("Name used in an XML schema for the first element under the root element of a Message Definition.")
	@Mandatory
	java.lang.String getXmlTag();
	void setXmlTag(java.lang.String xmlTag);
	@Description("The BusinessArea to which this MessageDefinition belongs")
	@Mandatory
	iso20022.BusinessArea getBusinessArea();
	void setBusinessArea(iso20022.BusinessArea businessArea);
	@Description("XORs applied to a selection of the elements of the Message Definition.")
	
	java.util.List<iso20022.Xor> getXors();
	void setXors(java.util.List<iso20022.Xor> xors);

	@Description("a property of MessageDefinition that specifies the top level element of the MessageDefinition")
	@Mandatory
	java.lang.String getRootElement();
	void setRootElement(java.lang.String rootElement);
	@Description("a MessageBuildingBlock belonging to this MessageDefinition")
	
	java.util.List<iso20022.MessageBuildingBlock> getMessageBuildingBlock();
	void setMessageBuildingBlock(java.util.List<iso20022.MessageBuildingBlock> messageBuildingBlock);

	@Description("the MessageChoreography to which the MessageDefinition belongs")
	
	java.util.List<iso20022.MessageChoreography> getChoreography();
	void setChoreography(java.util.List<iso20022.MessageChoreography> choreography);

	@Description("all of the MessageTypeTraces from one MessageDefinition that are traced to different MessageTransmissions")
	
	java.util.List<iso20022.MessageTransmission> getTrace();
	void setTrace(java.util.List<iso20022.MessageTransmission> trace);

	@Description("The MessageDefinitionIdentifier for this MessageDefinition")
	@Mandatory
	iso20022.MessageDefinitionIdentifier getMessageDefinitionIdentifier();
	void setMessageDefinitionIdentifier(iso20022.MessageDefinitionIdentifier messageDefinitionIdentifier);
	@Description("All of the SyntaxMessageSchemes that are derived from from one MessageDefinition")
	
	java.util.List<iso20022.SyntaxMessageScheme> getDerivation();
	void setDerivation(java.util.List<iso20022.SyntaxMessageScheme> derivation);

}
