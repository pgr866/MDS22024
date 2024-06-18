import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-paginanoticia')
export class VistaPaginanoticia extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; position: absolute;">
 <vaadin-vertical-layout style="flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-xl); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-xl); flex-grow: 0; width: 100%; align-self: center;" id="Layoutcontenedornoticiapaginanoticia">
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 200%; align-self: center;" id="Labeltitulonoticiapaginanoticia">Título Noticia</label>
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 100%; align-self: center;" id="Labeltitulotematicapaginanoticia">Temática</label>
  <vaadin-vertical-layout style="width: 100%; max-width: 1000px; align-self: center;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1; align-self: center;">
    <vaadin-vertical-layout id="Layoutimagennoticiapaginanoticia" style="align-self: center; flex-shrink: 0;"></vaadin-vertical-layout>
    <vaadin-horizontal-layout style="width: 95%; flex-shrink: 0; justify-content: space-between; flex-grow: 0; align-self: center; height: 5%; padding-right: var(--lumo-space-xl);">
     <vaadin-horizontal-layout style="flex-shrink: 0; height: 100%; align-self: center; flex-grow: 0; width: 65%; padding-right: var(--lumo-space-l);" id="Layoutfechaautorlugarpaginanoticia">
      <label style="flex-shrink: 0; text-align: left; width: 33%;" id="Layoutfechapaginanoticia">Fecha</label>
      <label style="flex-shrink: 0; text-align: center; width: 33%;" id="Layoutautorpaginanoticia">Autor</label>
      <label style="flex-shrink: 0; text-align: right; width: 33%;" id="Layoutlugarpaginanoticia">Lugar</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 10%; height: 100%; padding: 0; align-self: center;" id="Layouteliminarpaginanoticia">
      <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; background-color: #FFFFFF;" id="Buttoneliminarpaginanoticia">
       <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/nhTZQWjY/papelera.png" id="Imageneliminarpaginanoticia">
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout style="height: 100%; width: 20%; flex-shrink: 0; align-self: center;">
      <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 100%; justify-content: space-between; position: relative; align-items: center; padding: 0;" id="Mostrarvaloracionnoticiapaginanoticia"></vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout style="width: 95%; flex-shrink: 0; padding: 0; padding-bottom: var(--lumo-space-xl);">
    <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; flex-grow: 0; align-self: center; position: relative; padding: 0;" id="Mostrarnoticiaresumidayextendidapaginanoticia"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <label style="flex-shrink: 0; align-self: center; font-size: 150%; align-self: center; padding-top: var(--lumo-space-xl);" id="Labelseccioncomentarios">Comentarios</label>
  <vaadin-horizontal-layout style="flex-shrink: 0; flex-grow: 0; width: 75%; justify-content: space-between; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl); align-self: center;" id="Layoutcomentarioseccioncomentarios">
   <vaadin-button style="flex-shrink: 0; flex-grow: 0; align-self: center; width: 20%;" id="Botonanadircomentarioseccioncomentarios">
     Añadir comentario 
   </vaadin-button>
   <vaadin-text-area placeholder="Escriba un comentario..." style="width: 77%; height: 100%;" id="Textareacomentarioseccioncomentarios"></vaadin-text-area>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; flex-grow: 0; position: relative; align-items: center;" id="Layoutseccioncomentariospaginanoticia"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
