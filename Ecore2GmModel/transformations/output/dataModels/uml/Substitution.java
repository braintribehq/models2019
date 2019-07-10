/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Substitution of the Data Model uml.
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
{@link substitutingClassifier}, 

* It provides of then following operations (getters and setters)
{@link getContract},
{@link getSubstitutingClassifier},
{@link setContract},
{@link setSubstitutingClassifier},
 */

@Description("A substitution is a relationship between two classifiers signifying that the substituting classifier complies with the contract specified by the contract classifier. This implies that instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.<p>From package UML::Classification.</p>")

public interface Substitution extends GenericEntity, uml.Realization {

	EntityType<Substitution> T = EntityTypes.T(Substitution.class);

	/* Constants for each property name. */
	java.lang.String contract = "contract";
	java.lang.String substitutingClassifier = "substitutingClassifier";

	@Description("The contract with which the substituting classifier complies.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getContract();
	void setContract(uml.Classifier contract);
	@Description("Instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getSubstitutingClassifier();
	void setSubstitutingClassifier(uml.Classifier substitutingClassifier);
}
