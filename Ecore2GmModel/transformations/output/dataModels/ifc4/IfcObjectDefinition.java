/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcObjectDefinition of the Data Model iai.
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
{@link HasAssignments}, 
{@link Nests}, 
{@link IsNestedBy}, 
{@link HasContext}, 
{@link IsDecomposedBy}, 
{@link Decomposes}, 
{@link HasAssociations}, 

* It provides of then following operations (getters and setters)
{@link getHasAssignments},
{@link getNests},
{@link getIsNestedBy},
{@link getHasContext},
{@link getIsDecomposedBy},
{@link getDecomposes},
{@link getHasAssociations},
{@link setHasAssignments},
{@link setNests},
{@link setIsNestedBy},
{@link setHasContext},
{@link setIsDecomposedBy},
{@link setDecomposes},
{@link setHasAssociations},
 */

@Description("")

public interface IfcObjectDefinition extends GenericEntity, ifc4.IfcRoot, ifc4.IfcDefinitionSelect {

	EntityType<IfcObjectDefinition> T = EntityTypes.T(IfcObjectDefinition.class);

	/* Constants for each property name. */
	java.lang.String HasAssignments = "HasAssignments";
	java.lang.String Nests = "Nests";
	java.lang.String IsNestedBy = "IsNestedBy";
	java.lang.String HasContext = "HasContext";
	java.lang.String IsDecomposedBy = "IsDecomposedBy";
	java.lang.String Decomposes = "Decomposes";
	java.lang.String HasAssociations = "HasAssociations";

	@Description("")
	
	java.util.List<ifc4.IfcRelAssigns> getHasAssignments();
	void setHasAssignments(java.util.List<ifc4.IfcRelAssigns> HasAssignments);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelNests> getNests();
	void setNests(java.util.List<ifc4.IfcRelNests> Nests);

	@Description("")
	
	java.util.List<ifc4.IfcRelNests> getIsNestedBy();
	void setIsNestedBy(java.util.List<ifc4.IfcRelNests> IsNestedBy);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelDeclares> getHasContext();
	void setHasContext(java.util.List<ifc4.IfcRelDeclares> HasContext);

	@Description("")
	
	java.util.List<ifc4.IfcRelAggregates> getIsDecomposedBy();
	void setIsDecomposedBy(java.util.List<ifc4.IfcRelAggregates> IsDecomposedBy);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelAggregates> getDecomposes();
	void setDecomposes(java.util.List<ifc4.IfcRelAggregates> Decomposes);

	@Description("")
	
	java.util.List<ifc4.IfcRelAssociates> getHasAssociations();
	void setHasAssociations(java.util.List<ifc4.IfcRelAssociates> HasAssociations);

}
