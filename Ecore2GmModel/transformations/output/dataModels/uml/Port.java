/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Port of the Data Model uml.
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
{@link isBehavior}, 
{@link isConjugated}, 
{@link isService}, 
{@link protocol}, 
{@link provided}, 
{@link redefinedPort}, 
{@link required}, 

* It provides of then following operations (getters and setters)
{@link getIsBehavior},
{@link getIsConjugated},
{@link getIsService},
{@link getProtocol},
{@link getProvided},
{@link getRedefinedPort},
{@link getRequired},
{@link setIsBehavior},
{@link setIsConjugated},
{@link setIsService},
{@link setProtocol},
{@link setProvided},
{@link setRedefinedPort},
{@link setRequired},
 */

@Description("A Port is a property of an EncapsulatedClassifier that specifies a distinct interaction point between that EncapsulatedClassifier and its environment or between the (behavior of the) EncapsulatedClassifier and its internal parts. Ports are connected to Properties of the EncapsulatedClassifier by Connectors through which requests can be made to invoke BehavioralFeatures. A Port may specify the services an EncapsulatedClassifier provides (offers) to its environment as well as the services that an EncapsulatedClassifier expects (requires) of its environment.  A Port may have an associated ProtocolStateMachine.<p>From package UML::StructuredClassifiers.</p>")

public interface Port extends GenericEntity, uml.Property {

	EntityType<Port> T = EntityTypes.T(Port.class);

	/* Constants for each property name. */
	java.lang.String isBehavior = "isBehavior";
	java.lang.String isConjugated = "isConjugated";
	java.lang.String isService = "isService";
	java.lang.String protocol = "protocol";
	java.lang.String provided = "provided";
	java.lang.String redefinedPort = "redefinedPort";
	java.lang.String required = "required";

	@Description("Specifies whether requests arriving at this Port are sent to the classifier behavior of this EncapsulatedClassifier. Such a Port is referred to as a behavior Port. Any invocation of a BehavioralFeature targeted at a behavior Port will be handled by the instance of the owning EncapsulatedClassifier itself, rather than by any instances that it may contain.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsBehavior();
	void setIsBehavior(types.Boolean isBehavior);
	@Description("Specifies the way that the provided and required Interfaces are derived from the Port?s Type.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsConjugated();
	void setIsConjugated(types.Boolean isConjugated);
	@Description("If true, indicates that this Port is used to provide the published functionality of an EncapsulatedClassifier.  If false, this Port is used to implement the EncapsulatedClassifier but is not part of the essential externally-visible functionality of the EncapsulatedClassifier and can, therefore, be altered or deleted along with the internal implementation of the EncapsulatedClassifier and other properties that are considered part of its implementation.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsService();
	void setIsService(types.Boolean isService);
	@Description("An optional ProtocolStateMachine which describes valid interactions at this interaction point.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Protocolstatemachine getProtocol();
	void setProtocol(uml.Protocolstatemachine protocol);
	@Description("The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCclassifier offers to its environment via this Port, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived according to the value of isConjugated. If isConjugated is false, provided is derived as the union of the sets of Interfaces realized by the type of the port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface. If isConjugated is true, it is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Interface> getProvided();
	void setProvided(java.util.List<uml.Interface> provided);

	@Description("A Port may be redefined when its containing EncapsulatedClassifier is specialized. The redefining Port may have additional Interfaces to those that are associated with the redefined Port or it may replace an Interface by one of its subtypes.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Port> getRedefinedPort();
	void setRedefinedPort(java.util.List<uml.Port> redefinedPort);

	@Description("The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCassifier expects its environment to handle via this port. This association is derived according to the value of isConjugated. If isConjugated is false, required is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes. If isConjugated is true, it is derived as the union of the sets of Interfaces realized by the type of the Port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Interface> getRequired();
	void setRequired(java.util.List<uml.Interface> required);

}
