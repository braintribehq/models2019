/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Instancespecification of the Data Model uml.
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
{@link classifier}, 
{@link slot}, 
{@link specification}, 

* It provides of then following operations (getters and setters)
{@link getClassifier},
{@link getSlot},
{@link getSpecification},
{@link setClassifier},
{@link setSlot},
{@link setSpecification},
 */

@Description("An InstanceSpecification is a model element that represents an instance in a modeled system. An InstanceSpecification can act as a DeploymentTarget in a Deployment relationship, in the case that it represents an instance of a Node. It can also act as a DeployedArtifact, if it represents an instance of an Artifact.<p>From package UML::Classification.</p>")

public interface Instancespecification extends GenericEntity, uml.Deploymenttarget, uml.Packageableelement, uml.Deployedartifact {

	EntityType<Instancespecification> T = EntityTypes.T(Instancespecification.class);

	/* Constants for each property name. */
	java.lang.String classifier = "classifier";
	java.lang.String slot = "slot";
	java.lang.String specification = "specification";

	@Description("The Classifier or Classifiers of the represented instance. If multiple Classifiers are specified, the instance is classified by all of them.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getClassifier();
	void setClassifier(java.util.List<uml.Classifier> classifier);

	@Description("A Slot giving the value or values of a StructuralFeature of the instance. An InstanceSpecification can have one Slot per StructuralFeature of its Classifiers, including inherited features. It is not necessary to model a Slot for every StructuralFeature, in which case the InstanceSpecification is a partial description.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Slot> getSlot();
	void setSlot(java.util.List<uml.Slot> slot);

	@Description("A specification of how to compute, derive, or construct the instance.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Valuespecification getSpecification();
	void setSpecification(uml.Valuespecification specification);
}
