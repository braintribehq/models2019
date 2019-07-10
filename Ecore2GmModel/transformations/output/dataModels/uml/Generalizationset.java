/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Generalizationset of the Data Model uml.
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
{@link isCovering}, 
{@link isDisjoint}, 
{@link powertype}, 
{@link generalization}, 

* It provides of then following operations (getters and setters)
{@link getIsCovering},
{@link getIsDisjoint},
{@link getPowertype},
{@link getGeneralization},
{@link setIsCovering},
{@link setIsDisjoint},
{@link setPowertype},
{@link setGeneralization},
 */

@Description("A GeneralizationSet is a PackageableElement whose instances represent sets of Generalization relationships.<p>From package UML::Classification.</p>")

public interface Generalizationset extends GenericEntity, uml.Packageableelement {

	EntityType<Generalizationset> T = EntityTypes.T(Generalizationset.class);

	/* Constants for each property name. */
	java.lang.String isCovering = "isCovering";
	java.lang.String isDisjoint = "isDisjoint";
	java.lang.String powertype = "powertype";
	java.lang.String generalization = "generalization";

	@Description("Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsCovering();
	void setIsCovering(types.Boolean isCovering);
	@Description("Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsDisjoint();
	void setIsDisjoint(types.Boolean isDisjoint);
	@Description("Designates the Classifier that is defined as the power type for the associated GeneralizationSet, if there is one.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getPowertype();
	void setPowertype(uml.Classifier powertype);
	@Description("Designates the instances of Generalization that are members of this GeneralizationSet.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Generalization> getGeneralization();
	void setGeneralization(java.util.List<uml.Generalization> generalization);

}
