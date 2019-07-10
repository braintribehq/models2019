/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interface of the Data Model uml.
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
{@link nestedClassifier}, 
{@link ownedAttribute}, 
{@link ownedReception}, 
{@link protocol}, 
{@link redefinedInterface}, 
{@link ownedOperation}, 

* It provides of then following operations (getters and setters)
{@link getNestedClassifier},
{@link getOwnedAttribute},
{@link getOwnedReception},
{@link getProtocol},
{@link getRedefinedInterface},
{@link getOwnedOperation},
{@link setNestedClassifier},
{@link setOwnedAttribute},
{@link setOwnedReception},
{@link setProtocol},
{@link setRedefinedInterface},
{@link setOwnedOperation},
 */

@Description("Interfaces declare coherent services that are implemented by BehavioredClassifiers that implement the Interfaces via InterfaceRealizations.<p>From package UML::SimpleClassifiers.</p>")

public interface Interface extends GenericEntity, uml.Classifier {

	EntityType<Interface> T = EntityTypes.T(Interface.class);

	/* Constants for each property name. */
	java.lang.String nestedClassifier = "nestedClassifier";
	java.lang.String ownedAttribute = "ownedAttribute";
	java.lang.String ownedReception = "ownedReception";
	java.lang.String protocol = "protocol";
	java.lang.String redefinedInterface = "redefinedInterface";
	java.lang.String ownedOperation = "ownedOperation";

	@Description("References all the Classifiers that are defined (nested) within the Interface.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Classifier> getNestedClassifier();
	void setNestedClassifier(java.util.List<uml.Classifier> nestedClassifier);

	@Description("The attributes (i.e., the Properties) owned by the Interface.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Property> getOwnedAttribute();
	void setOwnedAttribute(java.util.List<uml.Property> ownedAttribute);

	@Description("Receptions that objects providing this Interface are willing to accept.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Reception> getOwnedReception();
	void setOwnedReception(java.util.List<uml.Reception> ownedReception);

	@Description("References a ProtocolStateMachine specifying the legal sequences of the invocation of the BehavioralFeatures described in the Interface.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Protocolstatemachine getProtocol();
	void setProtocol(uml.Protocolstatemachine protocol);
	@Description("References all the Interfaces redefined by this Interface.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Interface> getRedefinedInterface();
	void setRedefinedInterface(java.util.List<uml.Interface> redefinedInterface);

	@Description("The Operations owned by the Interface.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Operation> getOwnedOperation();
	void setOwnedOperation(java.util.List<uml.Operation> ownedOperation);

}
