/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Feature of the Data Model uml.
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
{@link featuringClassifier}, 
{@link isStatic}, 

* It provides of then following operations (getters and setters)
{@link getFeaturingClassifier},
{@link getIsStatic},
{@link setFeaturingClassifier},
{@link setIsStatic},
 */

@Description("A Feature declares a behavioral or structural characteristic of Classifiers.<p>From package UML::Classification.</p>")
 
@Abstract 

public interface Feature extends GenericEntity, uml.Redefinableelement {

	EntityType<Feature> T = EntityTypes.T(Feature.class);

	/* Constants for each property name. */
	java.lang.String featuringClassifier = "featuringClassifier";
	java.lang.String isStatic = "isStatic";

	@Description("The Classifiers that have this Feature as a feature.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getFeaturingClassifier();
	void setFeaturingClassifier(java.util.List<uml.Classifier> featuringClassifier);

	@Description("Specifies whether this Feature characterizes individual instances classified by the Classifier (false) or the Classifier itself (true).<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsStatic();
	void setIsStatic(types.Boolean isStatic);
}
