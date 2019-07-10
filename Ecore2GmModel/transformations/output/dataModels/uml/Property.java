/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Property of the Data Model uml.
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
{@link datatype}, 
{@link interface_}, 
{@link default_}, 
{@link aggregation}, 
{@link associationEnd}, 
{@link qualifier}, 
{@link class_}, 
{@link defaultValue}, 
{@link isComposite}, 
{@link isDerived}, 
{@link isDerivedUnion}, 
{@link isID}, 
{@link opposite}, 
{@link owningAssociation}, 
{@link redefinedProperty}, 
{@link subsettedProperty}, 
{@link association}, 

* It provides of then following operations (getters and setters)
{@link getDatatype},
{@link getInterface_},
{@link getDefault_},
{@link getAggregation},
{@link getAssociationEnd},
{@link getQualifier},
{@link getClass_},
{@link getDefaultValue},
{@link getIsComposite},
{@link getIsDerived},
{@link getIsDerivedUnion},
{@link getIsID},
{@link getOpposite},
{@link getOwningAssociation},
{@link getRedefinedProperty},
{@link getSubsettedProperty},
{@link getAssociation},
{@link setDatatype},
{@link setInterface_},
{@link setDefault_},
{@link setAggregation},
{@link setAssociationEnd},
{@link setQualifier},
{@link setClass_},
{@link setDefaultValue},
{@link setIsComposite},
{@link setIsDerived},
{@link setIsDerivedUnion},
{@link setIsID},
{@link setOpposite},
{@link setOwningAssociation},
{@link setRedefinedProperty},
{@link setSubsettedProperty},
{@link setAssociation},
 */

@Description("A Property is a StructuralFeature. A Property related by ownedAttribute to a Classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the Classifier to a value or set of values of the type of the attribute. A Property related by memberEnd to an Association represents an end of the Association. The type of the Property is the type of the end of the Association. A Property has the capability of being a DeploymentTarget in a Deployment relationship. This enables modeling the deployment to hierarchical nodes that have Properties functioning as internal parts.  Property specializes ParameterableElement to specify that a Property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.<p>From package UML::Classification.</p>")

public interface Property extends GenericEntity, uml.Structuralfeature, uml.Connectableelement, uml.Deploymenttarget {

	EntityType<Property> T = EntityTypes.T(Property.class);

	/* Constants for each property name. */
	java.lang.String datatype = "datatype";
	java.lang.String interface_ = "interface_";
	java.lang.String default_ = "default_";
	java.lang.String aggregation = "aggregation";
	java.lang.String associationEnd = "associationEnd";
	java.lang.String qualifier = "qualifier";
	java.lang.String class_ = "class_";
	java.lang.String defaultValue = "defaultValue";
	java.lang.String isComposite = "isComposite";
	java.lang.String isDerived = "isDerived";
	java.lang.String isDerivedUnion = "isDerivedUnion";
	java.lang.String isID = "isID";
	java.lang.String opposite = "opposite";
	java.lang.String owningAssociation = "owningAssociation";
	java.lang.String redefinedProperty = "redefinedProperty";
	java.lang.String subsettedProperty = "subsettedProperty";
	java.lang.String association = "association";

	@Description("The DataType that owns this Property, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Datatype getDatatype();
	void setDatatype(uml.Datatype datatype);
	@Description("The Interface that owns this Property, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Interface getInterface_();
	void setInterface_(uml.Interface interface_);
	@Description("")
	@Mandatory
	types.String getDefault_();
	void setDefault_(types.String default_);
	@Description("Specifies the kind of aggregation that applies to the Property.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.AggregationKind getAggregation();
	void setAggregation(uml.AggregationKind aggregation);
	@Description("Designates the optional association end that owns a qualifier attribute.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Property getAssociationEnd();
	void setAssociationEnd(uml.Property associationEnd);
	@Description("An optional list of ordered qualifier attributes for the end.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Property> getQualifier();
	void setQualifier(java.util.List<uml.Property> qualifier);

	@Description("The Class that owns this Property, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Class getClass_();
	void setClass_(uml.Class class_);
	@Description("A ValueSpecification that is evaluated to give a default value for the Property when an instance of the owning Classifier is instantiated.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Valuespecification getDefaultValue();
	void setDefaultValue(uml.Valuespecification defaultValue);
	@Description("If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute. This is a derived value, indicating whether the aggregation of the Property is composite or not.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsComposite();
	void setIsComposite(types.Boolean isComposite);
	@Description("Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsDerived();
	void setIsDerived(types.Boolean isDerived);
	@Description("Specifies whether the property is derived as the union of all of the Properties that are constrained to subset it.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsDerivedUnion();
	void setIsDerivedUnion(types.Boolean isDerivedUnion);
	@Description("True indicates this property can be used to uniquely identify an instance of the containing Class.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsID();
	void setIsID(types.Boolean isID);
	@Description("In the case where the Property is one end of a binary association this gives the other end.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Property getOpposite();
	void setOpposite(uml.Property opposite);
	@Description("The owning association of this property, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Association getOwningAssociation();
	void setOwningAssociation(uml.Association owningAssociation);
	@Description("The properties that are redefined by this property, if any.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Property> getRedefinedProperty();
	void setRedefinedProperty(java.util.List<uml.Property> redefinedProperty);

	@Description("The properties of which this Property is constrained to be a subset, if any.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Property> getSubsettedProperty();
	void setSubsettedProperty(java.util.List<uml.Property> subsettedProperty);

	@Description("The Association of which this Property is a member, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Association getAssociation();
	void setAssociation(uml.Association association);
}
