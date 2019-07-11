/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProductDefinitionShape of the Data Model iai.
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
{@link ShapeOfProduct}, 
{@link HasShapeAspects}, 

* It provides of then following operations (getters and setters)
{@link getShapeOfProduct},
{@link getHasShapeAspects},
{@link setShapeOfProduct},
{@link setHasShapeAspects},
 */

@Description("")

public interface IfcProductDefinitionShape extends GenericEntity, ifc4.IfcProductRepresentation, ifc4.IfcProductRepresentationSelect {

	EntityType<IfcProductDefinitionShape> T = EntityTypes.T(IfcProductDefinitionShape.class);

	/* Constants for each property name. */
	java.lang.String ShapeOfProduct = "ShapeOfProduct";
	java.lang.String HasShapeAspects = "HasShapeAspects";

	@Description("")
	
	java.util.List<ifc4.IfcProduct> getShapeOfProduct();
	void setShapeOfProduct(java.util.List<ifc4.IfcProduct> ShapeOfProduct);

	@Description("")
	
	java.util.List<ifc4.IfcShapeAspect> getHasShapeAspects();
	void setHasShapeAspects(java.util.List<ifc4.IfcShapeAspect> HasShapeAspects);

}
