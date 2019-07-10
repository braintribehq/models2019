/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Generalization of the Data Model uml.
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
{@link general}, 
{@link generalizationSet}, 
{@link isSubstitutable}, 
{@link specific}, 

* It provides of then following operations (getters and setters)
{@link getGeneral},
{@link getGeneralizationSet},
{@link getIsSubstitutable},
{@link getSpecific},
{@link setGeneral},
{@link setGeneralizationSet},
{@link setIsSubstitutable},
{@link setSpecific},
 */

@Description("A Generalization is a taxonomic relationship between a more general Classifier and a more specific Classifier. Each instance of the specific Classifier is also an instance of the general Classifier. The specific Classifier inherits the features of the more general Classifier. A Generalization is owned by the specific Classifier.<p>From package UML::Classification.</p>")

public interface Generalization extends GenericEntity, uml.Directedrelationship {

	EntityType<Generalization> T = EntityTypes.T(Generalization.class);

	/* Constants for each property name. */
	java.lang.String general = "general";
	java.lang.String generalizationSet = "generalizationSet";
	java.lang.String isSubstitutable = "isSubstitutable";
	java.lang.String specific = "specific";

	@Description("The general classifier in the Generalization relationship.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getGeneral();
	void setGeneral(uml.Classifier general);
	@Description("Represents a set of instances of Generalization.  A Generalization may appear in many GeneralizationSets.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Generalizationset> getGeneralizationSet();
	void setGeneralizationSet(java.util.List<uml.Generalizationset> generalizationSet);

	@Description("Indicates whether the specific Classifier can be used wherever the general Classifier can be used. If true, the execution traces of the specific Classifier shall be a superset of the execution traces of the general Classifier. If false, there is no such constraint on execution traces. If unset, the modeler has not stated whether there is such a constraint or not.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsSubstitutable();
	void setIsSubstitutable(types.Boolean isSubstitutable);
	@Description("The specializing Classifier in the Generalization relationship.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getSpecific();
	void setSpecific(uml.Classifier specific);
}
