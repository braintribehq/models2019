/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Classifiertemplateparameter of the Data Model uml.
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
{@link allowSubstitutable}, 
{@link constrainingClassifier}, 

* It provides of then following operations (getters and setters)
{@link getAllowSubstitutable},
{@link getConstrainingClassifier},
{@link setAllowSubstitutable},
{@link setConstrainingClassifier},
 */

@Description("A ClassifierTemplateParameter exposes a Classifier as a formal template parameter.<p>From package UML::Classification.</p>")

public interface Classifiertemplateparameter extends GenericEntity, uml.Templateparameter {

	EntityType<Classifiertemplateparameter> T = EntityTypes.T(Classifiertemplateparameter.class);

	/* Constants for each property name. */
	java.lang.String allowSubstitutable = "allowSubstitutable";
	java.lang.String constrainingClassifier = "constrainingClassifier";

	@Description("Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getAllowSubstitutable();
	void setAllowSubstitutable(types.Boolean allowSubstitutable);
	@Description("The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any Classifier that is compatible with this constraining Classifier can be substituted; otherwise, it must be either this Classifier or one of its specializations. If this property is empty, there are no constraints on the Classifier that can be used as an argument.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getConstrainingClassifier();
	void setConstrainingClassifier(java.util.List<uml.Classifier> constrainingClassifier);

}
