/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interfacerealization of the Data Model uml.
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
{@link contract}, 
{@link implementingClassifier}, 

* It provides of then following operations (getters and setters)
{@link getContract},
{@link getImplementingClassifier},
{@link setContract},
{@link setImplementingClassifier},
 */

@Description("An InterfaceRealization is a specialized realization relationship between a BehavioredClassifier and an Interface. This relationship signifies that the realizing BehavioredClassifier conforms to the contract specified by the Interface.<p>From package UML::SimpleClassifiers.</p>")

public interface Interfacerealization extends GenericEntity, uml.Realization {

	EntityType<Interfacerealization> T = EntityTypes.T(Interfacerealization.class);

	/* Constants for each property name. */
	java.lang.String contract = "contract";
	java.lang.String implementingClassifier = "implementingClassifier";

	@Description("References the Interface specifying the conformance contract.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Interface getContract();
	void setContract(uml.Interface contract);
	@Description("References the BehavioredClassifier that owns this InterfaceRealization, i.e., the BehavioredClassifier that realizes the Interface to which it refers.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Behavioredclassifier getImplementingClassifier();
	void setImplementingClassifier(uml.Behavioredclassifier implementingClassifier);
}
