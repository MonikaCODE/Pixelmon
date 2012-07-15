package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelPidgeotto extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape27;
    ModelRenderer Shape8;
    ModelRenderer Shape16;
    ModelRenderer Shape21;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape30;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape33;
    ModelRenderer Shape34;
  
  public ModelPidgeotto()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 18);
      Shape1.addBox(-3F, 0F, 0F, 6, 8, 6);
      Shape1.setRotationPoint(0F, 16.5F, -5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0.7853982F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 24, 13);
      Shape2.addBox(-3F, -4F, -2F, 6, 4, 2);
      Shape2.setRotationPoint(0F, 22.2F, 0.6F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, -0.0743572F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 24, 26);
      Shape3.addBox(-3F, 0F, 0F, 6, 2, 4);
      Shape3.setRotationPoint(0F, 16.5F, -5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 24, 19);
      Shape4.addBox(-3F, 0F, 0F, 6, 5, 2);
      Shape4.setRotationPoint(0F, 18.5F, -5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0.8028515F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 8);
      Shape5.addBox(-2.5F, 0F, 0F, 5, 5, 5);
      Shape5.setRotationPoint(0F, 11.5F, -5F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(-2F, -2F, 0F, 2, 2, 5);
      Shape6.setRotationPoint(2.5F, 11.5F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, -0.2617994F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, -2F, 0F, 2, 2, 5);
      Shape7.setRotationPoint(-2.5F, 11.5F, -5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0.2617994F);
      Shape9 = new ModelRenderer(this, 16, 1);
      Shape9.addBox(-1F, 0F, 0F, 2, 2, 2);
      Shape9.setRotationPoint(0F, 10.5F, -5F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, -0.7853982F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 40, 17);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 7);
      Shape10.setRotationPoint(0F, 17.5F, 4F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0.3490659F, 0.1745329F, 0F);
      Shape11 = new ModelRenderer(this, 40, 17);
      Shape11.addBox(-1F, 0F, 0F, 1, 1, 7);
      Shape11.setRotationPoint(0F, 17.5F, 4F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0.3490659F, -0.1745329F, 0F);
      Shape12 = new ModelRenderer(this, 44, 25);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 6);
      Shape12.setRotationPoint(1F, 17.5F, 4F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0.2617994F, 0.2617994F, 0F);
      Shape13 = new ModelRenderer(this, 44, 25);
      Shape13.addBox(-1F, 0F, 0F, 1, 1, 6);
      Shape13.setRotationPoint(-1F, 17.5F, 4F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0.2617994F, -0.2617994F, 0F);
      Shape14 = new ModelRenderer(this, 40, 9);
      Shape14.addBox(0F, 0F, 0F, 1, 1, 7);
      Shape14.setRotationPoint(-0.5F, 17.5F, 4F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0.4363323F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 38, 1);
      Shape15.addBox(-1F, -1F, 0F, 2, 1, 1);
      Shape15.setRotationPoint(0F, 11.3F, -4.5F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 1.466077F, 0F, 0F);
      Shape15.mirror = false;
      Shape17 = new ModelRenderer(this, 36, 0);
      Shape17.addBox(-1F, 0F, 0F, 6, 1, 2);
      Shape17.setRotationPoint(-2F, 8.7F, -3.1F);
      Shape17.setTextureSize(64, 32);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 36, 0);
      Shape18.addBox(-1F, 0F, 0F, 5, 1, 2);
      Shape18.setRotationPoint(-1.5F, 8.7F, -1.1F);
      Shape18.setTextureSize(64, 32);
      Shape18.mirror = true;
      setRotation(Shape18, -0.1745329F, 0F, 0F);
      Shape19 = new ModelRenderer(this, 36, 0);
      Shape19.addBox(-1F, 0F, 0F, 4, 1, 2);
      Shape19.setRotationPoint(-1F, 9F, 0.9F);
      Shape19.setTextureSize(64, 32);
      Shape19.mirror = true;
      setRotation(Shape19, -0.4363323F, 0F, 0F);
      Shape27 = new ModelRenderer(this, 36, 1);
      Shape27.addBox(-2F, 0F, 0F, 4, 1, 1);
      Shape27.setRotationPoint(0F, 9.2F, -5.1F);
      Shape27.setTextureSize(64, 32);
      Shape27.mirror = true;
      setRotation(Shape27, -0.1745329F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 36, 0);
      Shape8.addBox(0F, 0F, -2F, 5, 1, 2);
      Shape8.setRotationPoint(-2.5F, 8.7F, -3.1F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0.2617994F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 18, 3);
      Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape16.setRotationPoint(1.5F, 22F, -1F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 0, 29);
      Shape21.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape21.setRotationPoint(-1F, 9.5F, -1F);
      Shape21.setTextureSize(64, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 18, 3);
      Shape23.addBox(-1F, 0F, 0F, 1, 1, 1);
      Shape23.setRotationPoint(-1.5F, 22F, -1F);
      Shape23.setTextureSize(64, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
      Shape24 = new ModelRenderer(this, 16, 1);
      Shape24.addBox(0F, 0F, -3F, 1, 1, 3);
      Shape24.setRotationPoint(1.5F, 23F, 0F);
      Shape24.setTextureSize(64, 32);
      Shape24.mirror = true;
      setRotation(Shape24, 0F, 0F, 0F);
      Shape25 = new ModelRenderer(this, 16, 1);
      Shape25.addBox(-1F, 0F, -3F, 1, 1, 3);
      Shape25.setRotationPoint(-1.5F, 23F, 0F);
      Shape25.setTextureSize(64, 32);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      Shape26 = new ModelRenderer(this, 17, 2);
      Shape26.addBox(0F, 0F, -2F, 1, 1, 2);
      Shape26.setRotationPoint(-2.5F, 23F, 0F);
      Shape26.setTextureSize(64, 32);
      Shape26.mirror = true;
      setRotation(Shape26, 0F, 0.4363323F, 0F);
      Shape28 = new ModelRenderer(this, 17, 2);
      Shape28.addBox(-1F, 0F, -2F, 1, 1, 2);
      Shape28.setRotationPoint(2.5F, 23F, 0F);
      Shape28.setTextureSize(64, 32);
      Shape28.mirror = true;
      setRotation(Shape28, 0F, -0.4363323F, 0F);
      Shape29 = new ModelRenderer(this, 17, 2);
      Shape29.addBox(-1F, 0F, -2F, 1, 1, 2);
      Shape29.setRotationPoint(-1.5F, 23F, 0F);
      Shape29.setTextureSize(64, 32);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, -0.4363323F, 0F);
      Shape29.mirror = false;
      Shape30 = new ModelRenderer(this, 26, 1);
      Shape30.addBox(0F, 0F, 0F, 1, 8, 4);
      Shape30.setRotationPoint(2.5F, 17F, -5F);
      Shape30.setTextureSize(64, 32);
      Shape30.mirror = true;
      setRotation(Shape30, 0.7853982F, 0F, 0F);
      Shape31 = new ModelRenderer(this, 17, 2);
      Shape31.addBox(0F, 0F, -2F, 1, 1, 2);
      Shape31.setRotationPoint(1.5F, 23F, 0F);
      Shape31.setTextureSize(64, 32);
      Shape31.mirror = true;
      setRotation(Shape31, 0F, 0.4363323F, 0F);
      Shape32 = new ModelRenderer(this, 26, 1);
      Shape32.addBox(-1F, 0F, 0F, 1, 8, 4);
      Shape32.setRotationPoint(-2.5F, 17F, -5F);
      Shape32.setTextureSize(64, 32);
      Shape32.mirror = true;
      setRotation(Shape32, 0.7853982F, 0F, 0F);
      Shape33 = new ModelRenderer(this, 20, 5);
      Shape33.addBox(0F, 0F, 0F, 1, 6, 2);
      Shape33.setRotationPoint(2.5F, 14.2F, -2.15F);
      Shape33.setTextureSize(64, 32);
      Shape33.mirror = true;
      setRotation(Shape33, 0.7853982F, 0F, 0F);
      Shape34 = new ModelRenderer(this, 20, 5);
      Shape34.addBox(-1F, 0F, 0F, 1, 6, 2);
      Shape34.setRotationPoint(-2.5F, 14.2F, -2.2F);
      Shape34.setTextureSize(64, 32);
      Shape34.mirror = true;
      setRotation(Shape34, 0.7853982F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
    Shape19.render(f5);
    Shape27.render(f5);
    Shape8.render(f5);
    Shape16.render(f5);
    Shape21.render(f5);
    Shape23.render(f5);
    Shape24.render(f5);
    Shape25.render(f5);
    Shape26.render(f5);
    Shape28.render(f5);
    Shape29.render(f5);
    Shape30.render(f5);
    Shape31.render(f5);
    Shape32.render(f5);
    Shape33.render(f5);
    Shape34.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}