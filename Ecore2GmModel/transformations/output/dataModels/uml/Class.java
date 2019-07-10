/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Class of the Data Model uml.
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
{@link ownedOperation}, 
{@link extension}, 
{@link isActive}, 
{@link nestedClassifier}, 
{@link ownedReception}, 
{@link superClass}, 

* It provides of then following operations (getters and setters)
{@link getOwnedOperation},
{@link getExtension},
{@link getIsActive},
{@link getNestedClassifier},
{@link getOwnedReception},
{@link getSuperClass},
{@link setOwnedOperation},
{@link setExtension},
{@link setIsActive},
{@link setNestedClassifier},
{@link setOwnedReception},
{@link setSuperClass},
 */

@Description("A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.<p>From package UML::StructuredClassifiers.</p>")

public interface Class extends GenericEntity, uml.Encapsulatedclassifier, uml.Behavioredclassifier {

	EntityType<Class> T = EntityTypes.T(Class.class);

	/* Constants for each property name. */
	java.lang.String ownedOperation = "ownedOperation";
	java.lang.String extension = "extension";
	java.lang.String isActive = "isActive";
	java.lang.String nestedClassifier = "nestedClassifier";
	java.lang.String ownedReception = "ownedReception";
	java.lang.String superClass = "superClass";

	@Description("The Operations owned by the Class.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Operation> getOwnedOperation();
	void setOwnedOperation(java.util.List<uml.Operation> ownedOperation);

	@Description("This property is used when the Class is acting as a metaclass. It references the Extensions that specify additional properties of the metaclass. The property is derived from the Extensions whose memberEnds are typed by the Class.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Extension> getExtension();
	void setExtension(java.util.List<uml.Extension> extension);

	@Description("Determines whether an object specified by this Class is active or not. If true, then the owning Class is referred to as an active Class. If false, then such a Class is referred to as a passive Class.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsActive();
	void setIsActive(types.Boolean isActive);
	@Description("The Classifiers owned by the Class that are not ownedBehaviors.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Classifier> getNestedClassifier();
	void setNestedClassifier(java.util.List<uml.Classifier> nestedClassifier);

	@Description("The Receptions owned by the Class.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Reception> getOwnedReception();
	void setOwnedReception(java.util.List<uml.Reception> ownedReception);

	@Description("The superclasses of a Class, derived from its Generalizations.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Class> getSuperClass();
	void setSuperClass(java.util.List<uml.Class> superClass);

}
