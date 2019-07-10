/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Message of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link argument}, 
{@link connector}, 
{@link interaction}, 
{@link messageKind}, 
{@link messageSort}, 
{@link receiveEvent}, 
{@link sendEvent}, 
{@link signature}, 

* It provides of then following operations (getters and setters)
{@link getArgument},
{@link getConnector},
{@link getInteraction},
{@link getMessageKind},
{@link getMessageSort},
{@link getReceiveEvent},
{@link getSendEvent},
{@link getSignature},
{@link setArgument},
{@link setConnector},
{@link setInteraction},
{@link setMessageKind},
{@link setMessageSort},
{@link setReceiveEvent},
{@link setSendEvent},
{@link setSignature},
 */

@Description("A Message defines a particular communication between Lifelines of an Interaction.<p>From package UML::Interactions.</p>")

public interface Message extends GenericEntity, uml.Namedelement {

	EntityType<Message> T = EntityTypes.T(Message.class);

	/* Constants for each property name. */
	java.lang.String argument = "argument";
	java.lang.String connector = "connector";
	java.lang.String interaction = "interaction";
	java.lang.String messageKind = "messageKind";
	java.lang.String messageSort = "messageSort";
	java.lang.String receiveEvent = "receiveEvent";
	java.lang.String sendEvent = "sendEvent";
	java.lang.String signature = "signature";

	@Description("The arguments of the Message.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Valuespecification> getArgument();
	void setArgument(java.util.List<uml.Valuespecification> argument);

	@Description("The Connector on which this Message is sent.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Connector getConnector();
	void setConnector(uml.Connector connector);
	@Description("The enclosing Interaction owning the Message.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interaction getInteraction();
	void setInteraction(uml.Interaction interaction);
	@Description("The derived kind of the Message (complete, lost, found, or unknown).<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.MessageKind getMessageKind();
	void setMessageKind(uml.MessageKind messageKind);
	@Description("The sort of communication reflected by the Message.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.MessageSort getMessageSort();
	void setMessageSort(uml.MessageSort messageSort);
	@Description("References the Receiving of the Message.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Messageend getReceiveEvent();
	void setReceiveEvent(uml.Messageend receiveEvent);
	@Description("References the Sending of the Message.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Messageend getSendEvent();
	void setSendEvent(uml.Messageend sendEvent);
	@Description("The signature of the Message is the specification of its content. It refers either an Operation or a Signal.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Namedelement getSignature();
	void setSignature(uml.Namedelement signature);
}
