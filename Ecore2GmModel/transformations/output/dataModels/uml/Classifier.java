/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Classifier of the Data Model uml.
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
{@link feature}, 
{@link attribute}, 
{@link collaborationUse}, 
{@link general}, 
{@link generalization}, 
{@link powertypeExtent}, 
{@link inheritedMember}, 
{@link isAbstract}, 
{@link isFinalSpecialization}, 
{@link ownedUseCase}, 
{@link useCase}, 
{@link redefinedClassifier}, 
{@link representation}, 
{@link substitution}, 

* It provides of then following operations (getters and setters)
{@link getFeature},
{@link getAttribute},
{@link getCollaborationUse},
{@link getGeneral},
{@link getGeneralization},
{@link getPowertypeExtent},
{@link getInheritedMember},
{@link getIsAbstract},
{@link getIsFinalSpecialization},
{@link getOwnedUseCase},
{@link getUseCase},
{@link getRedefinedClassifier},
{@link getRepresentation},
{@link getSubstitution},
{@link setFeature},
{@link setAttribute},
{@link setCollaborationUse},
{@link setGeneral},
{@link setGeneralization},
{@link setPowertypeExtent},
{@link setInheritedMember},
{@link setIsAbstract},
{@link setIsFinalSpecialization},
{@link setOwnedUseCase},
{@link setUseCase},
{@link setRedefinedClassifier},
{@link setRepresentation},
{@link setSubstitution},
 */

@Description("A Classifier represents a classification of instances according to their Features.<p>From package UML::Classification.</p>")
 
@Abstract 

public interface Classifier extends GenericEntity, uml.Namespace, uml.Redefinableelement, uml.Type, uml.Templateableelement {

	EntityType<Classifier> T = EntityTypes.T(Classifier.class);

	/* Constants for each property name. */
	java.lang.String feature = "feature";
	java.lang.String attribute = "attribute";
	java.lang.String collaborationUse = "collaborationUse";
	java.lang.String general = "general";
	java.lang.String generalization = "generalization";
	java.lang.String powertypeExtent = "powertypeExtent";
	java.lang.String inheritedMember = "inheritedMember";
	java.lang.String isAbstract = "isAbstract";
	java.lang.String isFinalSpecialization = "isFinalSpecialization";
	java.lang.String ownedUseCase = "ownedUseCase";
	java.lang.String useCase = "useCase";
	java.lang.String redefinedClassifier = "redefinedClassifier";
	java.lang.String representation = "representation";
	java.lang.String substitution = "substitution";

	@Description("Specifies each Feature directly defined in the classifier. Note that there may be members of the Classifier that are of the type Feature but are not included, e.g., inherited features.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Feature> getFeature();
	void setFeature(java.util.List<uml.Feature> feature);

	@Description("All of the Properties that are direct (i.e., not inherited or imported) attributes of the Classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Property> getAttribute();
	void setAttribute(java.util.List<uml.Property> attribute);

	@Description("The CollaborationUses owned by the Classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Collaborationuse> getCollaborationUse();
	void setCollaborationUse(java.util.List<uml.Collaborationuse> collaborationUse);

	@Description("The generalizing Classifiers for this Classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getGeneral();
	void setGeneral(java.util.List<uml.Classifier> general);

	@Description("The Generalization relationships for this Classifier. These Generalizations navigate to more general Classifiers in the generalization hierarchy.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Generalization> getGeneralization();
	void setGeneralization(java.util.List<uml.Generalization> generalization);

	@Description("The GeneralizationSet of which this Classifier is a power type.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Generalizationset> getPowertypeExtent();
	void setPowertypeExtent(java.util.List<uml.Generalizationset> powertypeExtent);

	@Description("All elements inherited by this Classifier from its general Classifiers.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Namedelement> getInheritedMember();
	void setInheritedMember(java.util.List<uml.Namedelement> inheritedMember);

	@Description("If true, the Classifier can only be instantiated by instantiating one of its specializations. An abstract Classifier is intended to be used by other Classifiers e.g., as the target of Associations or Generalizations.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsAbstract();
	void setIsAbstract(types.Boolean isAbstract);
	@Description("If true, the Classifier cannot be specialized.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsFinalSpecialization();
	void setIsFinalSpecialization(types.Boolean isFinalSpecialization);
	@Description("The UseCases owned by this classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Usecase> getOwnedUseCase();
	void setOwnedUseCase(java.util.List<uml.Usecase> ownedUseCase);

	@Description("The set of UseCases for which this Classifier is the subject.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Usecase> getUseCase();
	void setUseCase(java.util.List<uml.Usecase> useCase);

	@Description("The Classifiers redefined by this Classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getRedefinedClassifier();
	void setRedefinedClassifier(java.util.List<uml.Classifier> redefinedClassifier);

	@Description("A CollaborationUse which indicates the Collaboration that represents this Classifier.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Collaborationuse getRepresentation();
	void setRepresentation(uml.Collaborationuse representation);
	@Description("The Substitutions owned by this Classifier.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Substitution> getSubstitution();
	void setSubstitution(java.util.List<uml.Substitution> substitution);

}
