/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcElement of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Tag}, 
{@link FillsVoids}, 
{@link ConnectedTo}, 
{@link IsInterferedByElements}, 
{@link InterferesElements}, 
{@link HasProjections}, 
{@link ReferencedInStructures}, 
{@link HasOpenings}, 
{@link IsConnectionRealization}, 
{@link ProvidesBoundaries}, 
{@link ConnectedFrom}, 
{@link ContainedInStructure}, 
{@link HasCoverings}, 

* It provides of then following operations (getters and setters)
{@link getTag},
{@link getFillsVoids},
{@link getConnectedTo},
{@link getIsInterferedByElements},
{@link getInterferesElements},
{@link getHasProjections},
{@link getReferencedInStructures},
{@link getHasOpenings},
{@link getIsConnectionRealization},
{@link getProvidesBoundaries},
{@link getConnectedFrom},
{@link getContainedInStructure},
{@link getHasCoverings},
{@link setTag},
{@link setFillsVoids},
{@link setConnectedTo},
{@link setIsInterferedByElements},
{@link setInterferesElements},
{@link setHasProjections},
{@link setReferencedInStructures},
{@link setHasOpenings},
{@link setIsConnectionRealization},
{@link setProvidesBoundaries},
{@link setConnectedFrom},
{@link setContainedInStructure},
{@link setHasCoverings},
 */

@Description("")

public interface IfcElement extends GenericEntity, ifc4.IfcProduct, ifc4.IfcStructuralActivityAssignmentSelect {

	EntityType<IfcElement> T = EntityTypes.T(IfcElement.class);

	/* Constants for each property name. */
	java.lang.String Tag = "Tag";
	java.lang.String FillsVoids = "FillsVoids";
	java.lang.String ConnectedTo = "ConnectedTo";
	java.lang.String IsInterferedByElements = "IsInterferedByElements";
	java.lang.String InterferesElements = "InterferesElements";
	java.lang.String HasProjections = "HasProjections";
	java.lang.String ReferencedInStructures = "ReferencedInStructures";
	java.lang.String HasOpenings = "HasOpenings";
	java.lang.String IsConnectionRealization = "IsConnectionRealization";
	java.lang.String ProvidesBoundaries = "ProvidesBoundaries";
	java.lang.String ConnectedFrom = "ConnectedFrom";
	java.lang.String ContainedInStructure = "ContainedInStructure";
	java.lang.String HasCoverings = "HasCoverings";

	@Description("")
	@Mandatory
	java.lang.String getTag();
	void setTag(java.lang.String Tag);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelFillsElement> getFillsVoids();
	void setFillsVoids(java.util.List<ifc4.IfcRelFillsElement> FillsVoids);

	@Description("")
	
	java.util.List<ifc4.IfcRelConnectsElements> getConnectedTo();
	void setConnectedTo(java.util.List<ifc4.IfcRelConnectsElements> ConnectedTo);

	@Description("")
	
	java.util.List<ifc4.IfcRelInterferesElements> getIsInterferedByElements();
	void setIsInterferedByElements(java.util.List<ifc4.IfcRelInterferesElements> IsInterferedByElements);

	@Description("")
	
	java.util.List<ifc4.IfcRelInterferesElements> getInterferesElements();
	void setInterferesElements(java.util.List<ifc4.IfcRelInterferesElements> InterferesElements);

	@Description("")
	
	java.util.List<ifc4.IfcRelProjectsElement> getHasProjections();
	void setHasProjections(java.util.List<ifc4.IfcRelProjectsElement> HasProjections);

	@Description("")
	
	java.util.List<ifc4.IfcRelReferencedInSpatialStructure> getReferencedInStructures();
	void setReferencedInStructures(java.util.List<ifc4.IfcRelReferencedInSpatialStructure> ReferencedInStructures);

	@Description("")
	
	java.util.List<ifc4.IfcRelVoidsElement> getHasOpenings();
	void setHasOpenings(java.util.List<ifc4.IfcRelVoidsElement> HasOpenings);

	@Description("")
	
	java.util.List<ifc4.IfcRelConnectsWithRealizingElements> getIsConnectionRealization();
	void setIsConnectionRealization(java.util.List<ifc4.IfcRelConnectsWithRealizingElements> IsConnectionRealization);

	@Description("")
	
	java.util.List<ifc4.IfcRelSpaceBoundary> getProvidesBoundaries();
	void setProvidesBoundaries(java.util.List<ifc4.IfcRelSpaceBoundary> ProvidesBoundaries);

	@Description("")
	
	java.util.List<ifc4.IfcRelConnectsElements> getConnectedFrom();
	void setConnectedFrom(java.util.List<ifc4.IfcRelConnectsElements> ConnectedFrom);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelContainedInSpatialStructure> getContainedInStructure();
	void setContainedInStructure(java.util.List<ifc4.IfcRelContainedInSpatialStructure> ContainedInStructure);

	@Description("")
	
	java.util.List<ifc4.IfcRelCoversBldgElements> getHasCoverings();
	void setHasCoverings(java.util.List<ifc4.IfcRelCoversBldgElements> HasCoverings);

}
