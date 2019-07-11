/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcShapeAspect of the Data Model iai.
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
{@link ShapeRepresentations}, 
{@link Name}, 
{@link Description}, 
{@link ProductDefinitional}, 
{@link PartOfProductDefinitionShape}, 

* It provides of then following operations (getters and setters)
{@link getShapeRepresentations},
{@link getName},
{@link getDescription},
{@link getProductDefinitional},
{@link getPartOfProductDefinitionShape},
{@link setShapeRepresentations},
{@link setName},
{@link setDescription},
{@link setProductDefinitional},
{@link setPartOfProductDefinitionShape},
 */

@Description("")

public interface IfcShapeAspect extends GenericEntity {

	EntityType<IfcShapeAspect> T = EntityTypes.T(IfcShapeAspect.class);

	/* Constants for each property name. */
	java.lang.String ShapeRepresentations = "ShapeRepresentations";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String ProductDefinitional = "ProductDefinitional";
	java.lang.String PartOfProductDefinitionShape = "PartOfProductDefinitionShape";

	@Description("")
	
	java.util.List<ifc4.IfcShapeModel> getShapeRepresentations();
	void setShapeRepresentations(java.util.List<ifc4.IfcShapeModel> ShapeRepresentations);

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	ifc4.Tristate getProductDefinitional();
	void setProductDefinitional(ifc4.Tristate ProductDefinitional);
	@Description("")
	@Mandatory
	ifc4.IfcProductRepresentationSelect getPartOfProductDefinitionShape();
	void setPartOfProductDefinitionShape(ifc4.IfcProductRepresentationSelect PartOfProductDefinitionShape);
}
